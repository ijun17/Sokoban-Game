package com.zetcode;

import java.util.ArrayList;
import java.util.Collections;

public class Level
{
    public ArrayList<String> levels = new ArrayList<>();
    
    public Level()
    {
        Collections.addAll(levels   , "\n   ###\n"
                                    + "   #.#\n"
                                    + "   # #\n"
                                    + "####$####\n"
                                    + "#. $@$ .#\n"
                                    + "####l####\n"
                                    + "   # #\n"
                                    + "   #.#\n"
                                    + "   ###\n"
                                  
                                    , "\n      ###\n"
                                    + "      #.#\n"
                                    + "    ### ###\n"
                                    + "    #.$ $.#\n"
                                    + "  ##### #####\n"
                                    + "  #.#*# #*#.#\n"
                                    + "###$###l###$###\n"
                                    + "#.    $@$    .#\n"
                                    + "###$###*###$###\n"
                                    + "  #.#*# #*#.#\n"
                                    + "  ##### #####\n"
                                    + "    #.$ $.#\n"
                                    + "    ### ###\n"
                                    + "      # #\n"
                                    + "      ###\n"
                                    
                                    , "\n   #######\n"
                                    + "####     #\n"
                                    + "#   .### #\n"
                                    + "# # #    ##\n"
                                    + "# # $ $#. #\n"
                                    + "# #  *  # #\n"
                                    + "# .#$ l # #\n"
                                    + "##    # # ###\n"
                                    + " # ###.   @ #\n"
                                    + " #     ##   #\n"
                                    + " ############\n"
                                    
                                    
                                    
                                    ,"\n#####   \n"
                                    +"#  .####\n"
                                    +"#@l $  #\n"
                                    +"## .   #\n"
                                    +" #######\n"
                                    
                                    , "\n################\n"
                                    + "#...#  ##  #...#\n"
                                    + "#... $ ## $ ...#\n"
                                    + "#... $ ## $ ...#\n"
                                    + "##   $ ## $   ##\n"
                                    + "# $$$$    $$$$ #\n"
                                    + "#      $ $     #\n"
                                    + "##### $ $  #####\n"
                                    + "#####  $@$ #####\n"
                                    + "#     $ l      #\n"
                                    + "# $$$$    $$$$ #\n"
                                    + "##   $ ## $   ##\n"
                                    + "#... $ ## $ ...#\n"
                                    + "#... $ ## $ ...#\n"
                                    + "#...#  ##  #...#\n"
                                    + "################\n"
                                         
                               ////////////////////////////////////////     
                          
                                   
                                    ,"\n##############\n"
                                    +"# $   ...... #\n"
                                    +"# $ @ ### ####\n"
                                    +"# $   #  $####\n"
                                    +"#   # # $* ###\n"
                                    +"#####    l #\n"
                                    +"    #    @ #\n"
                                    +"    ########\n"
                                    
                                    ,"\n############\n"
                                    +"#.. #     ###\n"
                                    +"#..  # $  $  #\n"
                                    +"#..@ #$####  #\n"
                                    +"#..    @ ##  #\n"
                                    +"#..  # #  $ ##\n"
                                    +"###### ##$ $ #\n"
                                    +"  # l  $ $ $  #\n"
                                    +"  #    #     #\n"
                                    +"  ############\n"
                                    
                                    
                                    ,"\n        ########\n"
                                    +"        # @   @#\n"
                                    +"        # $#$ ##\n"
                                    +"        # $  $#\n"
                                    +"        ##$ $ # \n"
                                    +"######### * # ###\n"
                                    +"#....  ## $  $  #\n"
                                    +"##..    $  $   #\n"
                                    +"#....  ##########\n"
                                    +"########\n"
                                                                
                            
                                    
                                    , "\n####### #### #######\n"
                                    + "#     # #..# #     #\n"
                                    + "# l$  ###..###  $$ #\n"
                                    + "#  $  #......#  $  #\n"
                                    + "# $$  #......#  $$ #\n"
                                    + "#  ######..######  #\n"
                                    + "# $#    #..#    #$ #\n"
                                    + "#  # $$      $$ #  #\n"
                                    + "# $#  ## @  ##  #$ #\n"
                                    + "#      $ ## $      #\n"
                                    + "#  #  ## @  ##  #  #\n"
                                    + "####################\n" 
                                    
                                    
                                    , "\n        ######\n"
                                    + "        #    ####\n"
                                    + "        # ##  l #\n"
                                    + "        #  $    #\n"
                                    + "######### #### ###\n"
                                    + "#...   #   $   $ #\n"
                                    + "#...     $   $  @#\n"
                                    + "#...     $   $  @#\n"
                                    + "#...   #   $   $ #\n"
                                    + "######### #### ###\n"
                                    + "        #  $    #\n"
                                    + "        # ##  $ #\n"
                                    + "        #    ####\n"
                                    + "        ######\n" );
    }
    public String getLevel(int n) {
    	String map = levels.get(n).toString();
    	return map;
    }
} 