# Funds

Aplikacja do wyliczania kwot dla funduszy
inwestycyjnych

## Wstęp
Aplikacja opiera się na dwóch klasach:
- context.PercentageContext
- amount.Calculate

Pierwsza przyjmuje strategię obliczania (safe, aggressive, balanced). Na podstawie tego oblicza rozłożenie procentowe inwestycji.
Druga klasa przyjmuje tablicę procentów i na tej podstawie oblicza jakie kwoty przeznaczyć na inwestycje.

W zadaniu podany był problem radzenia sobie z resztą (procentu i kwoty). Aplikacja powinna wyliczać odpowiednie dane. W moim przypadku dane wyliczane są losowo. Czyli jeżeli (tak jak w przykładzie), mamy procent 0.02 więcej (LP: 1), przyjąłem, że nie jest ważne, do którego funduszu przydzieli ten kawałek, dlatego aplikacja przydziela go do losowego funduszu.