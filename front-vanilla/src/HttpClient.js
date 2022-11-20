export default class HttpClient {

    static async send(url, method, data) { 

        const options = {
            method: method,
            headers: {
                "Content-type": "application/json"
            }
        };
        if (data != null ) {
            options.body = JSON.stringify(data)
        }
        const response = await fetch(url, options);
        const headers = response.headers;
        if (headers.get("content-type") == "application/json") {
            return  await response.json(); // Json Object
            
        }
        return null;
    }
}