package lab7;

import java.util.Hashtable;


public class executionOfProgram {

  /**
   * @param args
   */
  public static void main(String[] args) {

    // TODO create a HashTable called fileHashTable
    Hashtable fileHashTable = new Hashtable();

    initializeHashTableWithFileExtension(fileHashTable);

    // now imagine at this point you write code to get files off your hdd
    // and you have extracted the file extension i.e. pdf or doc or txt

    // TODO Hardcode your string fileExtension to "pdf"
    String fileExtension = "pdf";


    try {
      // TODO Get the appropriate class that belongs to fileExtension.
      String className = "lab7." + fileHashTable.get(fileExtension);


      // TODO Use the Class.forName method to get the class for the file
      // extension
      // i.e. 'openPDF', or 'openWord' or 'openTXT'
      // Note: the class name must be preceded by the package name.
      // Eg. packageName.className
      Class useClass = Class.forName(className);


      try {
        // TODO create an instance of the which ever the Class is from above
        // using newInstance
        File instanceOfFileClass = (File) useClass.newInstance();

        instanceOfFileClass.printContentsOfFile();
        instanceOfFileClass.printDateOFfile();
        instanceOfFileClass.printOwnerOfFile();

      } catch (InstantiationException e) {
        e.printStackTrace();
      } catch (IllegalAccessException e) {
        e.printStackTrace();
      }

    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }



  }

  private static void initializeHashTableWithFileExtension(
      Hashtable filehashtable) {
    // TODO add three items to table
    filehashtable.put("pdf", "openPDF");
    filehashtable.put("doc", "openWord");
    filehashtable.put("txt", "openTXT");
  }

}
