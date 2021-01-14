package ChaineResponsabilite.Logger;

public class ErrorLogger extends AbstractLogger {

  public ErrorLogger(int level){
     this.level = level;
  }

  
  /** 
   * @param message
   */
  @Override
  protected void write(String message) {		
     System.out.println("Error Console::Logger: " + message);
  }
}