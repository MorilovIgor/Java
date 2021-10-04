class Methods {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    static void printThreeWords() {
        System.out.println("Orange"+"\n"+"Banana"+"\n"+"Apple");
    }
    
    static void checkSumSign() {
        int a = 17;
        int b = -5;
        int c = a + b;
        System.out.println(c>=0?"Сумма положительная" : "Сумма отрицательная");
    }
        
    
    static void printColor() {
        int value = 77;
        if (value<=0) {
            System.out.println("Красный");
        }
        if (value>0 && value<=100) {
            System.out.println("Желтый");
        }
        if (value>100) {
            System.out.println("Зеленый");
        }
    }	
    
    static void compareNumbers() {
        int a = 13;
        int b = 666;
        System.out.println(a>=b?"a>=b" : "a<b");
    }
}
