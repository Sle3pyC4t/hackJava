package AbstractSyntaxTree;

import utils.Logger;

import static utils.IO.getFileContent;

public class ASTBuilder {
    Logger<ASTBuilder> log = new Logger<>(this);
    public String sourcePath = "";
    public ASTBuilder(String path){
        this.sourcePath = path;
    }
    public void parseSourceToAST(){
        String fileContent = getFileContent(this.sourcePath);
        log.debug("\n" + fileContent);
    }
}
