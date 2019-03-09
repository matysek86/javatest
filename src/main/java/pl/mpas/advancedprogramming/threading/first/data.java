package pl.mpas.advancedprogramming.threading.first;

public class data {
}
// w jeddnym procesie może dzaiłać wiele wątków
// w obrębie procesów musimy współpdzielić pamięć


//Róznica pomiędzy klasą Therad a intrfejsemRunable
// Runable ma tylko jedną metodę Runablle - to praca do wykonania
// jeżeli w klasie jest native to znaczy że jest napisane w innym języku dopasowane do systemu
// wątki startujemy raz worker.start() bo wysypie błedem
// run od start różni siętym że start podspodem woła run
// nie mamy kontroli nad współbierznością czyli kiedy się wykonają wątki
// set deamon pozwala żyć wątką dokpuki nie zakończy głowny wątek main czyli tego który ich powołac.
// stany krtróe użwa sie w javie   to stan new i reminated czyli żywi y martwy



