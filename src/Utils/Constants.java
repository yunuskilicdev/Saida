package Utils;

import Data.Constant;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YUNUS on 15.04.2017.
 */
public class Constants {
    public Constants(){
        this.Commands = new ArrayList<>();
        this.Commands.add(AddAlertCommand);
        this.Commands.add(GenerateCommand);
    }
    public String ExitCommand = "Exit";
    public String AddAlertCommand = "Add";
    public String GenerateCommand = "Generate";
    public String StringDivider = " ";
    public int InputWordCount = 2;
    public List<String> Commands;

}
