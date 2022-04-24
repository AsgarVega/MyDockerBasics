:- ensure_loaded(server).

run :-
    server(8080),
    repeat,
    sleep(10),
    fail. 

:- run.
