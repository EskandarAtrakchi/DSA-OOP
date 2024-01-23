package contact;

/**
 *
 * @author Eskandar Atrakchi 23137517
 */
public class Business extends Contact { 
    
    private String type ;

    public Business() {
    }

    public Business(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
