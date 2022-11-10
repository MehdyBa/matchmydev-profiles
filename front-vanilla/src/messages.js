
export default class Messages {

    static messages = null;

    static async init(){
    
        const response = await fetch(`./src/resources/messages.json`); 
        Messages.messages = await response.json();
    }
    

}
