<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <title>Add Product | Product Management System</title>
</head>
<body>

<div >
  <h2>Add to cart </h2>
  <form action="addtocart" method="POST">
    <label for="name">Product Name</label>
    <input type="text" name="name" id="name" required />

    <label for="brand">Brand</label>
    <input type="text" name="brand" id="brand" required />

    <label for="color">Color</label>
    <input type="text" name="color" id="color" required />

    <label for="price">Price (in USD)</label>
    <input type="number" name="price" id="price" step="0.01" required />

    <button type="submit">Add Product to Cart</button>
  </form>
</div>

</body>
</html>