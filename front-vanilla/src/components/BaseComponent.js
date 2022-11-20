import I18N from "../I18N.js";

export default class BaseComponent {

    msg = I18N.messages;

    dtf = (str) => {
        const date = new Date(str);
        return I18N.dtf.format(date)
    }

    selector = null

    target = null;

    constructor(selector){
        this.selector = selector;
    }

    render(){
        this.target = document.querySelector(this.selector);
        this.target.innerHTML = this.template(); 
    }

    template(){
        return null;
    }


}