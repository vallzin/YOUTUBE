import { Component, Input } from '@angular/core';
import { User } from '../../_models/user';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrl: './users.component.css'
})
export class UsersComponent {

  // users: String[] = ['Vinicius', 'Amanda', 'Larissa', 'Matheus']

  users: User[] = [
    {
      nome: 'Vinicius',
      idade: 25
    },
    {
      nome: 'Amanda',
      idade: 19
    },
    {
      nome: 'Larissa',
      idade: 30
    },
    {
      nome: 'Matheus',
      idade: 40
    }
  ]
}
