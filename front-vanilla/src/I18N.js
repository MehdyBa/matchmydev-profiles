
export default class I18N {

    static messages = null;

    static dtf = null;

    static async init(){

        const dtfOptions = { dateStyle: 'short', timeStyle: 'long' };

       I18N.dtf =  new Intl.DateTimeFormat('en', dtfOptions);
    
        const response = await fetch(`./src/resources/messages.json`); 
        I18N.messages = await response.json();
    }
    

}
