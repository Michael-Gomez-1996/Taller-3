Feature: Navegación en sitio de noticias

  Scenario: Ingresar a la página principal y navegar a una sección desde el banner
    Given I navigate to "https://cnnespanol.cnn.com/"
    When I go to a section using the navigation bar
