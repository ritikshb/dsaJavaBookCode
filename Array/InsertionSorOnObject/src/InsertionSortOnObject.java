public class InsertionSortOnObject {
    private Display[] arr;
    private int insertEm;
    public InsertionSortOnObject(int max){
        arr = new Display[max];
        insertEm = 0;
    }
    public void find(String lName){
        int i;
        for(i = 0;i<insertEm;i++){
            if(arr[i].getLastName().equals(lName))
                break;
        }
        if(i == insertEm)
            System.out.println("no Name Found");
        else
            System.out.println("Founded that person on index: " +i +" and name is " +lName);
    }
    public void insert(String lName,String fName,int age){
        arr[insertEm] = new Display(lName,fName,age);
        insertEm++;
    }

    public void delete(String lName){
        int j;
        for(j = 0;j<insertEm;j++){
            if(arr[j].getLastName().equals(lName))
                break;
        }
        if(j == insertEm)
            System.out.println("no name is present");
        else
            for(int k = j;k<insertEm;k++){
                arr[k] = arr[k+1];
            }
        insertEm--;
    }

    public void display(){
        for(int i = 0; i<insertEm;i++){
            arr[i].display();
        }
    }
    public void insertionSortOnObjects(){
        for(int out = 1; out<insertEm;out++){
            Display key = arr[out];
            int i = out-1;
            while(i>=0 && arr[i].getLastName().compareTo(key.getLastName())>0){
                arr[i+1] = arr[i];
                i--;
            }
            arr[i+1] = key;
        }
    }
}
