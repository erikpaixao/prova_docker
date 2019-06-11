const express = require("express")
const router = express.Router()

const agencia_controller = require("../controllers/agencia.controller")

router.get("/", agencia_controller.getAll)

router.get("/:id", agencia_controller.get)

router.post("/", agencia_controller.create)

router.put("/:id", agencia_controller.update)

router.delete("/:id", agencia_controller.delete)

module.exports = router
