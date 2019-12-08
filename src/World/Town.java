package World;

import java.util.ArrayList;
import java.util.Objects;

public class Town extends Locality {


    private ArrayList<House> Houses = new ArrayList<>();
    private ArrayList<LuminousCreature> LuminousCreatures = new ArrayList<>();
    private Resource myStone = new Resource(Resources.STONE);
    private Resource myProtoplasm = new Resource(Resources.PROTOPLASM);
    private Resource myCellMass = new Resource(Resources.CELLMASS);

    public Town(String name, String location) {
        super(name, TypeOfLocality.TOWN, location);
    }

    public Town(String name, String location, int Stone, int Protoplasm, int CellMass) throws ResourcesValueError {
        super(name, TypeOfLocality.TOWN, location);
        try {
            if (Stone < 0 || Protoplasm < 0 || CellMass < 0) {
                throw new ResourcesValueError();
            }
        } catch (ResourcesValueError e) {
            System.out.println(e.getMessage());
            Stone = Math.abs(Stone);
            CellMass = Math.abs(CellMass);
            Protoplasm = Math.abs(Protoplasm);
        }
        this.myStone.setValue(Stone);
        this.myProtoplasm.setValue(Protoplasm);
        this.myCellMass.setValue(CellMass);
    }

    public void addHouses(House house) {
        this.Houses.add(house);
        EventMessage.message("В населённом пункте " + this.name + " зарегистрирован новый дом ");
    }

    public ArrayList<House> getHouses() {
        return Houses;
    }

    public void addLuminousCreature(LuminousCreature luminousCreature) {
        this.LuminousCreatures.add(luminousCreature);
    }

    public int getResourceValue(Resources typeOfResource) {
        int value = 0;
        switch (typeOfResource) {
            case STONE:
                value = myStone.getValue();
                break;
            case CELLMASS:
                value = myCellMass.getValue();
                break;
            case PROTOPLASM:
                value = myProtoplasm.getValue();
                break;
        }
        return value;
    }

    public void setResourceValue(Resources typeOfResource, int value) {
        switch (typeOfResource) {
            case STONE:
                myStone.setValue(value);
                break;
            case CELLMASS:
                myCellMass.setValue(value);
                break;
            case PROTOPLASM:
                myProtoplasm.setValue(value);
                break;
        }
    }

    public Resources getMinResType() {
        Resources minType = Resources.STONE;
        if (getResourceValue(Resources.STONE) > getResourceValue(Resources.PROTOPLASM)) {
            minType = Resources.PROTOPLASM;
        }
        if (getResourceValue(minType) > getResourceValue(Resources.CELLMASS)) {
            minType = Resources.CELLMASS;
        }
        return minType;
    }

    protected void BuildingInTown(Wiseacre maker) {
        new House(maker);
    }

    @Override
    public String toString() {
        return "Класс: " + getClass().getName() +
                "\nТип: " + type.getName() +
                "\nНазвание: " + name +
                "\nКоординаты: " +this.PointToString()+
                "\nМестность: " + location +
                "\nСклад ресурсов: " + myStone.getType().getName() + " " + myStone.getValue() + ", " + myProtoplasm.getType().getName() + " " + myProtoplasm.getValue() + ", " + myCellMass.getType().getName() + " " + myCellMass.getValue() +
                "\nКоличество построенных домов: " + Houses.size();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Town town = (Town) obj;
        return getLocation().equals(town.getLocation()) &&
                getName().equals(town.getName()) &&
                getHouses().size() == town.getHouses().size();
    }

    protected class House {
        private int number;
        private Town town;

        public House(Wiseacre maker) {
            this.number = Houses.size() + 1;
            this.town = Town.this;
            EventMessage.message(maker.getName() + " строит дом номер " + number + " в " + town.getName());
            if (!(maker.getLocality() == null) && ((maker.getLocality().getType()) == TypeOfLocality.TOWN)) {
                ((Town) maker.getLocality()).addHouses(this);
            }
        }

        public Town getTown() {
            return town;
        }

        public int getNumber() {
            return number;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Town.House house = (Town.House) obj;
            return number == house.getNumber() && town.equals(house.getTown());
        }

        @Override
        public String toString() {
            return "Класс: " + getClass().getName() +
                    "\nПорядковый номер : " + number;
        }

        @Override
        public int hashCode() {
            return Objects.hash(number);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location, type.getName());
    }
}
