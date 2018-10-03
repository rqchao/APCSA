public class Project5 {
public static void main(String[] args) {
        System.out.println("This is the house that Jack built.");
        v2();
        v3();
        v4();
        v5();
        v6();
        v7();
}

public static void jack(){
        System.out.println("That lay in the house that Jack built.\n");
}
public static void malt(){
        System.out.println("That ate the malt");
}
public static void rat(){
        System.out.println("That killed the rat,");
}
public static void cat(){
        System.out.println("That worried the cat,");
}
public static void dog(){
        System.out.println("That tossed the dog,");
}
public static void cow(){
        System.out.println("That milked the cow with the crumpled horn");
}
public static void v2(){
        System.out.println("This is the malt");
        jack();
}
public static void v3(){
        System.out.println("This is the rat,");
        malt();
        jack();
}
public static void v4(){
        System.out.println("This is the cat,");
        rat();
        malt();
        jack();
}
public static void v5(){
        System.out.println("This is the dog,");
        cat();
        rat();
        malt();
        jack();
}
public static void v6(){
        System.out.println("This is the cow with the crumpled horn,");
        dog();
        cat();
        rat();
        malt();
        jack();
}
public static void v7(){
        System.out.println("This is the maiden all forlorn");
        cow();
        dog();
        cat();
        rat();
        malt();
        jack();
}
}
