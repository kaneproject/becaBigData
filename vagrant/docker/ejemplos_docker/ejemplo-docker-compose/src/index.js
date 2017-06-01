var express = require('express');
var os = require("os");
var app = express();
var hostname = os.hostname();
app.get('/', function (req, res) {
res.send('<html><body>ejemplo desde express con Node.js desde el contenedor ' +
hostname + '</body></html>');
});
app.listen(80);
console.log('Iniciado en http://localhost');
