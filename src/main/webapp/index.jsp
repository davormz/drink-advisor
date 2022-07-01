<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Drink advisor</title>
    <link rel="stylesheet" href="/styles/main.css"/>
</head>
<body>
    <jsp:include page="/pages/header.jsp" />
    <section class="content">
        <form class="form" action="SelectBeer.do" method="post">
            <h2 class="form__title">Select beer characteristics: </h2>
            <div class="form__content">
                <div class="form__item">
                    <label for="color">Color:</label>
                    <select name="color" size="1" id="color">
                        <option value="light">light</option>
                        <option value="amber">amber</option>
                        <option value="brown">brown</option>
                        <option value="dark">dark</option>
                    </select>
                </div>
            </div>
            <div class="from__controls">
                <input class="button" type="submit">
            </div>
        </form>
    </section>
    <jsp:include page="/pages/footer.jsp" />
</body>
</html>
