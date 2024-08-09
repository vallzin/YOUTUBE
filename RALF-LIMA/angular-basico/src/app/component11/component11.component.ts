import { Component } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { Pessoa } from '../modelo/Pessoa';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-component11',
  standalone: true,
  imports: [
    ReactiveFormsModule,
    CommonModule
  ],
  templateUrl: './component11.component.html',
  styleUrl: './component11.component.css'
})
export class Component11Component {

  //Objeto de formulário
  formulario = new FormGroup({
    nome: new FormControl('', [
      Validators.required,
      Validators.minLength(3)]),
    idade: new FormControl(null, [
      Validators.required,
      Validators.min(0),
      Validators.max(120)]),
    cidade: new FormControl('', [
      Validators.required,
      Validators.minLength(3)])
  });

  //visibilidade dos botões
  btnCadastrar:boolean = true;

  //armazenar índice da pessoa selecionada
  indice:number = -1;

  //vetor
  vetor:Pessoa[] = [];

  //função de cadastro
  cadastrar(){
    //cadastro no vetor
    this.vetor.push(this.formulario.value as Pessoa);
    //limpeza dos inputs
    this.formulario.reset();
    //visualização via console
    // console.table(this.vetor);
  }

  //função de seleção
  selecionar(indice:number){
    //atribuir o índice da pessoa
    this.indice = indice;
    //atribuir os dados da pessoa no formulário
    this.formulario.setValue({
      nome  : this.vetor[indice].nome,
      idade : this.vetor[indice].idade,
      cidade: this.vetor[indice].cidade
    });
    //visibilidade dos botões
    this.btnCadastrar = false;
  }

  //função de alteração
  alterar(){
    //alterar vetor
    this.vetor[this.indice] = this.formulario.value as Pessoa;
    //limpeza os inputs
    this.formulario.reset();
    //visibilidade dos botões
    this.btnCadastrar = true;
  }

  //função de remoção
  remover(){
    //removendo pessoa do vetor
    this.vetor.splice(this.indice, 1);
    //limpeza dos inputs
    this.formulario.reset();
    //visibilidade dos botões
    this.btnCadastrar = true;
  }

  //função cancelar
  cancelar(){
    //limpeza dos inputs
    this.formulario.reset;
    //visibilidade dos botões
    this.btnCadastrar = true;
  }

}
