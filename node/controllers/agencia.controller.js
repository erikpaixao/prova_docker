const express = require("express")
const router = express.Router()

const Agencia = require("../models/agencia.model")

exports.getAll = async (req, res) => {
  try {
    const agencias = await Agencia.find()
    return res.send(agencias)
  } catch (error) {
    console.log(error)
    return res.status(400).send("Erro ao salvar agencia", error)
  }
}

exports.create = async (req, res) => {
  try {
    const agencia = await Agencia.create(req.body)
    console.log(req.body)
    return res.send({ agencia })
  } catch (error) {
    console.log(error)
    return res.status(400).send("Erro ao salvar agencia", error)
  }
}

exports.update = async (req, res) => {
  try {
    const agencia = await Agencia.findOneAndUpdate(
      req.params.id,
      {
        $set: req.body
      },
      { new: true }
    )
    return res.send(agencia)
  } catch (error) {
    console.log(error)
    return res.status(400).send("Erro ao salvar agencia", error)
  }
}

exports.delete = async (req, res) => {
  try {
    await Agencia.findOneAndDelete(req.params.id)
    return res.send()
  } catch (error) {
    console.log(error)
    return res.status(400).send("Erro ao salvar agencia", error)
  }
}

exports.get = async (req, res) => {
  try {
    return await Agencia.findById(req.params.id)
  } catch (error) {
    console.log(error)
    return res.status(400).send("Erro ao salvar agencia", error)
  }
}
