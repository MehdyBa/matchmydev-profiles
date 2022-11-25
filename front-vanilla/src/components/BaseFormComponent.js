import BaseComponent from "./BaseComponent.js";

export default class BaseFormComponent extends BaseComponent {
    props = null;

    constructor(selector, props) {
        super(selector);
        this.props = props;
    }
    
    async render(){
        super.render();
        const data = await this.dataModel();
        const properties = Object.keys(data);
        const form = this.target.querySelector("form");
        BaseFormComponent.bind(properties, form, data); 
        if(this.props.nonEditableSelector){
          const template =  this.nonEditableTemplate(data);
          const target = this.target.querySelector(this.props.nonEditableSelector);
          target.innerHTML = template;
        }
    }
    static bind(properties, form, data){
        properties.forEach((property) => {
            if(form.elements[property]){
                const element = form.elements[property];
            const type = element.type;
            BaseFormComponent.bindModelToView(element, type, data, property); 
            
            }
            
            
        }); 
    }
    static bindModelToView(element, type, data, property){
        if(type == "checkbox"){
            element.checked = data[property];

        } else {
            element.value = data[property];
        }
    }
}