/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
angular.module("mystorage", [])
        .value('urlBase', 'http://localhost:8080/mystorage/rest/')
        .controller("PessoaController", function ($http, urlBase) {
            var self = this;
            self.usuario = "Diego Dalto";

            self.pessoas = [];
            self.pessoa = undefined;

            self.novo = function () {
                self.pessoa = {};
            };

            self.salvar = function () {
                var metodo = 'POST';
                if (self.pessoa.id) {
                    metodo = 'PUT';
                }
                $http({
                    method: metodo,
                    url: urlBase + 'pessoas/',
                    data: self.pessoa
                }).then(function successCallback(response) {
                    self.atualizarTabela();
                }, function errorCallback(response) {
                    self.ocorreuErro();
                });
            };

            self.alterar = function (pessoa) {
                self.pessoa = pessoa;
            };
            self.deletar = function (pessoa) {
                self.pessoa = pessoa;
                
                $http({
                    method: 'DELETE',
                    url: urlBase + 'pessoas/' + self.pessoa.id + '/'
                }).then(function sucessCallback(response) {
                    self.atualizarTabela();
                }, function errorCallback(response){
                    self.ocorreuErro();
                });
            };
            self.concluir = function () {
                 alert("Não Criei o banco ainda!!!");
            };
            self.ocorreuErro = function (){
               alert("Ocorreu um erro inesperado!");  
            };
            self.atualizarTabela = function (){
                $http({
                    method: 'GET',
                    url: urlBase + 'pessoas/'
                }).then( function sucessCallback(response){
                    self.pessoas = response.data;
                    self.pessoa = undefined;
                }, function errorCallback(response){
                    self.ocorreuErro();
                });
            };
            
            self.activate = function (){
                self.atualizarTabela();
            };
            self.activate();

        });
