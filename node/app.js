var express = require("express")
var app = express()

const bodyParser = require("body-parser")
const agencia = require("./routes/agencia.route")

const PORT = 3000

const mongoose = require("mongoose")
const DB_URL = "mongodb://localhost:27017/prova"
const mongoDB = process.env.MONGODB_URI || DB_URL

app.use(bodyParser.json())
app.use(bodyParser.urlencoded({ extended: false }))

app.use("/", agencia)

mongoose.connect(mongoDB)

mongoose.Promise = global.Promise

let db = mongoose.connection

db.on("error", console.error.bind(console, "MongoDB connection error:"))

app.listen(PORT, function() {
  console.log("Example app listening on port 3000!")
})
