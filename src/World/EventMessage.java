package World;

public final class EventMessage {

    public static void message(String info, double s){
        System.out.println(info);
        if((Math.random()<s)&&(!info.contains("Создана новая скульптура"))){
            new Sculpture(info);
        }
    }

    public static void message(String info){
        double s = Math.random()/1.8;
//        double s = 0;
        message(info,s);
        }
    public static void  smile(){
        System.out.println("                                                                                                              \n" +
                "                                                                                                              \n" +
                "                                                                                                              \n" +
                "                                                                                                              \n" +
                "                                                                                                              \n" +
                "                                                                                                              \n" +
                "                                                                     B@@@@@@@@@#G                             \n" +
                "                                                                   #@@@@@@@@@@@@@@@@H                         \n" +
                "                                                         S285636  #@@@@@@@@@@@@@@@@@@@#                       \n" +
                "                                                   s#@@@@@@@@@@@@@@@@@@A      3##@@@@@@#M                     \n" +
                "                                                 #@ЭТО@@@@@БЫЛО@@@@@@@             @@@@@@@,                   \n" +
                "                                               #@@@@@@БОЛЬНО@@@@@@@@@                @@@@@@s                  \n" +
                "                                             @@@@@@@@;                                #@@@@@h                 \n" +
                "                                            #@@@@@M                                    @@@@@@:                \n" +
                "                                          #@@@@@#;                                      #@@@@@                \n" +
                "                                         @@@@@@@                                         @@@@@@               \n" +
                "                                       i@@@@@@                                            #@@@#@              \n" +
                "                                      @@@@@@@    @@@#               @@#A                   @@@@@:             \n" +
                "                                     @@@@@@H    @@@@@@             @@@@@@                  @M@@@@             \n" +
                "                                    #@@@##       @@#2              &@#@H                    @@@@@             \n" +
                "                                   #@@@@#                                                   #@@@@@            \n" +
                "                                   @@@@@                         //слёзка                    @@@@#            \n" +
                "                                  G@@@@#                                                     @@@@@            \n" +
                "                                  @@@@@@                                                     @@@@@            \n" +
                "                                  @@@@@G                                                     @@@@@            \n" +
                "                                  @@@@@&           @#                                        @@@@@            \n" +
                "                                  @@@@@@          @@@@@            A@@&                     @@@@@@            \n" +
                "                                  M@@@@@          B@@@@@s      2@@@@@@@                     #@@@@             \n" +
                "                                   @@@@#            @@@@@@@@@@@@@@@@@@                     ##@@@#             \n" +
                "                                   @@@@@#            A@@@@@@@@@@@@@s                      H@@@@@              \n" +
                "                                    @@@@#X               h@@@@r                          @@@@@@               \n" +
                "                                    @@@@@@,                                             @@@@@@A               \n" +
                "                                     @@@@@@@                                          @@@@@@@s                \n" +
                "                                      @@@@ПО@#                                     M#@@@@@@#                  \n" +
                "                                        @@@@СТ#@#                              @#@@@@@@@@@                    \n" +
                "                                         ;@@@@АВЬ@#M@i                  i@@##@@@@@@@@@@@                      \n" +
                "                                            @@@@@ТЕ@@@@@#@@@@@@@@@@@@@@@@@#@@@@@@@@@@                         \n" +
                "                                               3M@@@10@@PLS@@@@@@@@@@@@@@@@@@@@@r                             \n" +
                "                                                    #M@#@@@@@@@@@@@@#@@#@@s                                   \n" +
                "                                                          @@@@@@                                              \n" +
                "                                                          @@@@@@                                              \n" +
                "                                                          @@@@@@                                              \n" +
                "                                                         @@@@@@                                               \n" +
                "                                                         @@@@@#                                               \n" +
                "                                                         @@@@@G                                               \n" +
                "                                                        ##@@@#                                                \n" +
                "                                                        @@@@@@                                                \n" +
                "                                                       M@@@@@                                                 \n" +
                "                                                       #@@@@@                                                 \n" +
                "                                                       @@@@@@                                                 \n" +
                "                                                M@@@@@@@@@@@s                                                 \n" +
                "                                              M@@_vk.com_@@@&                                                 \n" +
                "                                           A@@@@_deni4kj_@@@@#h                                               \n" +
                "                                         @#@@@@@@@#  @@@@@@@@@##                                              \n" +
                "                                      2#@@@@@@@@9    @@@@@@@@@@@#@                                            \n" +
                "                                    A@@@@@@@@@       @@@@@@h@@@@@@@                                           \n" +
                "                                  s@@@@@@@#@         @@@@@@  @@@@@@@                                          \n" +
                "                                 @@@@@@@#M           @@@@@@   @@@@@@@                                         \n" +
                "                               r#@@@@@@S             @@@@@@    @@@@@#2                                        \n" +
                "                              @@@@@@@@               @@@@@@     @@@@@@                                        \n" +
                "                             @@@@@@@                 @@@@@@     r@@@@@@                                       \n" +
                "                            @@@@@@#                  @@@@@@      @@@@@@#                                      \n" +
                "                           @@@@@@@                   @@@@@@       @@@@@@G                                     \n" +
                "                          @@@@@@X                    @@@@@@        #@@@@@                                     \n" +
                "                        r@@@@@@9                     @@@@@#         @@@@@@                                    \n");
    }
    }
//    public static void message(String info, boolean makeInfo){
//        System.out.println(info);
//
//    }

