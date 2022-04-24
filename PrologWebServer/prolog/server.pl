:- use_module(library(http/thread_httpd)).
:- use_module(library(http/http_dispatch)).
:- use_module(library(http/http_files)).

server(Port) :-
    http_server(http_dispatch, [port(Port)]).

http:location(files, root(files), []).
:- http_handler(root(.), http_reply_from_files('files', []), [prefix]).

