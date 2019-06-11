var mongoose = require("mongoose")
var Schema = mongoose.Schema

var AgenciaSchema = new Schema({
  banco: { type: String, required: true, max: 50 },
  codigo: { type: String, required: true },
  endereco: String
})

module.exports = mongoose.model("Agencia", AgenciaSchema)
