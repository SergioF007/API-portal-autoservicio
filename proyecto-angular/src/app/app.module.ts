import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule, routingComponents } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './components/home/home.component';
import { DashboardComponent } from './vistas/dashboard/dashboard.component';
import { HeaderComponent } from './plantillas/header/header.component';
import { FooterComponent } from './plantillas/footer/footer.component';
import { ReactiveFormsModule, FormsModule} from '@angular/forms'
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    DashboardComponent,
    HeaderComponent,
    FooterComponent
    
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule, 
    FormsModule,
    HttpClientModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
