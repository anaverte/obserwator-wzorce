# obserwator-wzorce

Zadanie

Stwórz aplikację naśladującą zachowanie zegara centralnego i podłączonych do niego wyświetlaczy cyfrowych. Oczywiście trzeba w tym celu wykorzystać wzorzec projektowy "Obserwator". Program może składać się z trzech klas reprezentujących wyświetlacze czasu w formacie hh:mm (będących obserwatorami):

    WyswietlaczPokojowy
    WyswietlaczKuchenny
    WyswietlaczOgrodowy

Oraz jednej klasy obserwowanej ZegarCentralny, która symuluje zachowanie zegara centralnego i służy jedynie do odmierzania czasu (nie posiada on mechanizmu wyświetlania). Za wyświetlanie aktualnego czasu są odpowiedzialne klasy wyświetlaczy i tylko one mają realizować tą funkcjonalność. Klasa ZegarCentralny ma być obserwowana przez klasy wyświetlaczy i ma te obiekty informować o zmianie czasu.


Uwagi:

    Program powinien umożliwiać podłączenie/odłączenie danego wyświetlacza (obserwatora) od zegara centralnego (obiektu obserwowanego) w trakcie działania programu.  
    Zakładamy, że aktualizacja wyświetlanego czasu odbywa się co 1 minutę. 
    Proszę pamiętać o wykorzystaniu interfejsów!
