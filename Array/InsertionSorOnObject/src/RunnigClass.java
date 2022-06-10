public class RunnigClass {
    public static void main(String[] args){
        InsertionSortOnObject newInsertObj = new InsertionSortOnObject(100);
        newInsertObj.insert("Shawn","Mandas",10);
        newInsertObj.insert("Aksl","Mandas",12);
        newInsertObj.insert("ZSdsd","Mandas",130);
        newInsertObj.insert("Xzsa","Mandas",104);
        newInsertObj.insert("JI","Mandas",20);
        newInsertObj.insert("OJHIO","Mandas",40);
        newInsertObj.insert("XJK","Mandas",60);
        newInsertObj.insert("JAIS","Mandas",30);
        newInsertObj.insert("Oaeqw","Mandas",20);
        newInsertObj.insert("JSKO","Mandas",70);

        newInsertObj.display();

        newInsertObj.delete("JI");

        newInsertObj.insertionSortOnObjects();
        System.out.println();
        newInsertObj.display();

//        newInsertObj.find("JSKO");

    }
}
