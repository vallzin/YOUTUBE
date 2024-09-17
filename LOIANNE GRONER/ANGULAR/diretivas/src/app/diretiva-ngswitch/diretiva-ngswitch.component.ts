import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-diretiva-ngswitch',
  templateUrl: './diretiva-ngswitch.component.html',
  styleUrl: './diretiva-ngswitch.component.css'
})
export class DiretivaNgswitchComponent implements OnInit{

  aba: string = 'home';

  setAba(aba: string) {
    this.aba = aba;
  }

  constructor(){}
  ngOnInit(): void {}

}
