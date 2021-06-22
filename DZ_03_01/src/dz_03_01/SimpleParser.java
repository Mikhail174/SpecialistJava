
package dz_03_01;


public class SimpleParser extends ComLineParserBase  {
    
    private String inFile,outFile;

    public SimpleParser() {
        super(new String[]{"?","r","w"});
    }


    public String getInFile() {
        return inFile;
    }

    public String getOutFile() {
        return outFile;
    }
    
    @Override
    protected void OnUsage(String errorKey){
        if (errorKey != null)
            System.out.println("Command-line switch error:" + errorKey);

        System.out.println("формат ком.строки: имяПрограммы [-r<input-fileName>] [-w<output-fileName>]");
	System.out.println("   -?  показать Help файл");
	System.out.println("   -r  задать имя входного файла");
	System.out.println("   -w  выполнить вывод в указанный файл");
    }
    
    @Override
    protected SwitchStatus OnSwitch(String key, String keyValue) {
    SwitchStatus status  = SwitchStatus.NoError; 
    
    switch (key) {
        
        case "?": status = SwitchStatus.ShowUsage;
        break;
        case "r":  if (null!=keyValue) 
        {
            inFile = keyValue;
          
        }
                  else {   
                       System.out.println("Error!");
                       status = SwitchStatus.Error;
                    } break;
        case "w": if (null!=keyValue) {
            outFile = keyValue;
                    }
          else {   
                       System.out.println("Error!");
                       status = SwitchStatus.Error;
                    } break;
        
    }
        
    return SwitchStatus.Error;
    }
    

}
