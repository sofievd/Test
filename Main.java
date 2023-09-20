public class Main {
    public static String[] words = {"fisk", "val", "ko", "penguin","hund"};
    public static String[] verbs = {"klättra", "dansa", "sjunga", "hoppa", "springa"};

    public static void main(String[] args) {
        createStory();

    }
    public static String chooseRandomWord(){
        String chosenWord = "";
        int num = (int) (Math.random()* words.length);
        switch (num){
            case 0 -> chosenWord=words[0];
            case 1 -> chosenWord = words[1];
            case 2 -> chosenWord = words[2];
            case 3 -> chosenWord = words[3];
            case 4 -> chosenWord = words[4];
        }
        return chosenWord;
    }

    public static String chooseRandomVerb(){
        String chosenVerb = "";
        int num = (int) (Math.random()* words.length);
        switch (num){
            case 0 -> chosenVerb=verbs[0];
            case 1 -> chosenVerb = verbs[1];
            case 2 -> chosenVerb = verbs[2];
            case 3 -> chosenVerb= verbs[3];
            case 4 -> chosenVerb = verbs[4];
        }
        return chosenVerb;
    }
    public static String chooseNeverOrEver(){
        String word = "";
        int num=  (int)(Math.random()*2);
        if( num == 0){
            word = "altid";
        }
        else {
            word = "NEVER";
        }
        return word;
    }
    public static String chooseAlotRarely(){
        String word = "";
        int num=  (int)(Math.random()*2);
        if( num == 0){
            word = "ofta";
        }
        else {
            word = "sällan";
        }
        return word;
    }

    public static String chooseBestWorst(){
        String word = "";
        int num=  (int)(Math.random()*2);
        if( num == 0){
            word = "bästa";
        }
        else {
            word = "sämsta";
        }
        return word;
    }

    public static String chooseGoodBad(){
        String word = "";
        int num=  (int)(Math.random()*2);
        if( num == 0){
            word = "bra";
        }
        else {
            word = "dåligt";
        }
        return word;
    }
    public static String chooseHappySad(){
        String word = "";
        int num=  (int)(Math.random()*2);
        if( num == 0){
            word = "gott";
        }
        else {
            word = "dåligt";
        }
        return word;
    }
    public static void createStory (){
        String variable1 = chooseRandomWord();
        String variable2 = chooseRandomVerb();
        String variable3 = chooseRandomWord();

        String word = chooseNeverOrEver();
        String word1 = chooseAlotRarely();
        String word3 = chooseBestWorst();
        String word4 = chooseGoodBad();
        String word5 = chooseHappySad();

        System.out.println("Det var en gång en "+variable1 +" som skulle " + variable2 + "");
        System.out.println("Att vara en " + variable1 + " är "+ word+" lätt eftrsom att "+ variable2+ " gjorde man "+ word + "");
        System.out.println("Men en dag så kom det en "+ variable3+" som " + variable2+" de "+ word1+ " vilket "+ variable1+ " fascinerades av");
        System.out.println(variable1+" en och " + variable3+ " en blev sen " + word3+ " vänner vilket slutade " +word4);
        System.out.println("Slutet " +word5+ " alltid "+word5);
    }

}
