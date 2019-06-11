var express = require("express")
var app = express()
var router = express.Router()

const PORT = 8080
const HOST = "0.0.0.0"

router.use(function(req, res, next) {
  console.log("/" + req.method)
  next()
})

router.get("/", function(req, res) {
  res.sendFile(path + "index.html")
})

router.get("/:id", function(req, res) {
  res.sendFile(path + "sharks.html")
})

router.post("/", function(req, res) {
  res.sendFile(path + "sharks.html")
})

router.put("/:id", function(req, res) {
  res.sendFile(path + "sharks.html")
})

router.delete("/:id", function(req, res) {
  res.sendFile(path + "sharks.html")
})

app.use("/", router)

app.listen(3000, function() {
  console.log("Example app listening on port 3000!")
})
