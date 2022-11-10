let messages = null;

function initMessages(){
    
    const response = await fetch(`./src/resources/messages${lang}.json`); // c'est une promise for instant
    messages = await response.json();
}



export {initMessages, messages};
