const express = require("express");
const app = express();
const morgan = require("morgan");

morgan("dev"); //Logger
const APP_PORT = 3000;

const postRoute = require("./post.route");
app.use(express.json());
app.use("/post", postRoute);

app.get("/ping", (req, res) => {
  console.log(req.headers);
  res.send("pong!");
});
app.listen(APP_PORT, () =>
  console.log(`Server successfully started at port ${APP_PORT}`)
);
