import BaseComponent from "./BaseComponent.js";

export default class BaseFormComponent extends BaseComponent {
    props = null;

    constructor(selector, props) {
        super(selector);
        this.props = props;
    }
    render(){
        super.render();
        const data = this.dataModel();
        const properties = Object.keys(data);
        const form = this.target.querySelector("form");
    }
}