// JavaScript-Code, um ein iFrame mit HTTP-Inhalt zu befüllen und Mixed Content Errors zu umgehen

// Ziel-iFrame auswählen
var iframe = document.getElementById('mapIframe');

// URL des HTTP-Inhalts
var httpURL = 'http://map.twenture.net:8123/?worldname=world&mapname=flat&zoom=0&x=12500&y=64&z=484';

// iFrame-Src so setzen, dass es den HTTP-Inhalt lädt
iframe.src = httpURL;

