import BaseComponent from "../BaseComponent";

export default class MenuComponent extends BaseComponent {

  constructor() {
    super("#header");
}

template() { 
  return`<header class="bg-black fixed-top">
  <nav class="navbar navbar-expand-md navbar-dark container-xl">
    <span class="font-logo">
      <span>match</span
      ><span class="logo-center">my</span
      ><span>dev</span>
    </span>
    <button
      class="navbar-toggler me-2"
      type="button"
      data-bs-toggle="collapse"
      data-bs-target="#navbarNav">
      <span class="navbar-toggler-icon"></span>
    </button>
  </nav>
</header>`
;
}

}