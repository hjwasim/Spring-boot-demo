const express = require("express");
const route = express.Router();
const posts = require("./post.service");

route.get("/", (req, res) => {
  res.json(posts);
});

route.get("/:id", (req, res) => {
  try {
    const id = Number.parseInt(req.params.id);
    if (isNaN(id)) {
      throw Error("Provided Id is in wrong type.");
    }
    console.log(id);
    const post = posts.filter((p) => p.id === id);
    res.json(post);
  } catch (e) {
    res.json({ status: "failed", message: e.message });
  }
});

route.post("/", (req, res) => {
    const post = req.body;
    if (posts.filter(p => p.id == post.id).length > 0) {
        res.status(400).json({ status: "failed", message: "Post was already created on this ID." });
        return;
    }
    posts.push(post)
    res.json({ status: "success", message: "Post has been created!" });
});

route.delete("/:id", (req, res) => {
  try {
    const id = Number.parseInt(req.params.id);
    posts = posts.filter((p) => p.id != id);
    res.json({ status: "success", message: "Post has been deleted!" });
  } catch (e) {
    res.json({ status: "failed", message: "Post has not been deleted!" });
  }
});

module.exports = route;
