import Messages  from "../Messages.js";

export default class BaseComponent {

    msg = Messages.messages // instance field

    selector = null;       // instance field

    constructor(selector) {
        this.selector = selector;
    }
    
    render() {
        const target = document.querySelector(this.selector); // #main #footer, #header
        target.innerHTML = this.template();
    }

    template() {
        return null
    }
}