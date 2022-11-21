import { HomeComponent } from './view/home/home.component';
import { NgModule, Component } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdicionarComponent } from './view/adicionar/adicionar.component';

const routes: Routes = [
 {path: '', component: HomeComponent},
 {path: 'pessoa/adicionar', component: AdicionarComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
