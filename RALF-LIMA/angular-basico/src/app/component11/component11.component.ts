import { Component } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { Pessoa } from '../modelo/Pessoa';

@Component({
  selector: 'app-component11',
  standalone: true,
  imports: [ReactiveFormsModule],
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

  //vetor
  vetor:Pessoa[] = [];

}
