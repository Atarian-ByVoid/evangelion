Feature: Pilotar Evas

  Scenario: Sincronizar Shinji com a Unit-01
    Given o piloto "Shinji Ikari"
    And a unidade de Eva "Unit-01"
    When iniciar a sincronização
    Then a taxa de sincronização deve ser superior a 50%

  Scenario: Sincronização deve falhar para outros pilotos ou unidades
    Given o piloto "Asuka Langley Soryu"
    And a unidade de Eva "Unit-02"
    When iniciar a sincronização
    Then a taxa de sincronização deve falhar

  Scenario: Sincronização deve falhar para piloto Shinji com unidade diferente
    Given o piloto "Shinji Ikari"
    And a unidade de Eva "Unit-02"
    When iniciar a sincronização
    Then a taxa de sincronização deve falhar

  Scenario: Sincronização deve falhar para piloto diferente com Unit-01
    Given o piloto "Rei Ayanami"
    And a unidade de Eva "Unit-01"
    When iniciar a sincronização
    Then a taxa de sincronização deve falhar
