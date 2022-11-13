import BaseComponent from  "../BaseComponent.js";

export default class UnauthorizedComponent extends BaseComponent {

    constructor() {
        super("#main");
    }

    templete() {
        return `
        <h1>${this.msg.errors.unauthorized.h1}</h1>
        <p>${this.msg.errors.unauthorized.p}</p>
        <img class="error-image"
        src="./assets/images/unauthorized.svg"
        alt="${this.msg.errors.unauthorized.alt}">
    `;
    }
}