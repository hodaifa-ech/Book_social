import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {LoginComponent} from './pages/login/login.component';
import {RegisterComponent} from './pages/register/register.component';
import {ActivateAccountComponent} from './pages/activate-account/activate-account.component';
import {BookModule} from './modules/book/book.module';

const routes: Routes = [

  {
    path: 'login',
    component : LoginComponent
  },
  {
    path: 'register',
    component : RegisterComponent
  },
  {
    path: 'activate-account',
    loadChildren:() => import('./modules/book/book.module').then(m => m.BookModule)
  },
  {
    path: 'book',
    component : BookModule
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
