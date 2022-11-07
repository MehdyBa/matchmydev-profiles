let messages = null;

async function initMessages(){

    const browserLanguage = window.navigator.language; // fr, fr-fr, fr-FR, en, en-en-GB
    let lang = "";
    if(browserLanguage.startsWith("fr")){
        lang = "Fr";
    }

    const response = await fetch(`./src/resources/messages${lang}.json`); // c'est une promise for instant
    messages = await response.json();
}



export {initMessages, messages};
