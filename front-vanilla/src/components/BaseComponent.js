import Messages from "../Messages.js";

export default class BaseComponent{

    msg = Messages.messages;

    selector = null;

    constructor(selector){
        this.selector = selector;
    }

    render(){
        const target = document.querySelector(this.selector);
        target.innerHTML = this.template(); 
    }

    template(){
        return null;
    }


}