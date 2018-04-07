import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NgModule } from '@angular/core';
import {ChartModule} from 'primeng/chart';
import {TooltipModule} from 'primeng/tooltip';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { SidebarComponent } from './sidebar/sidebar.component';
import { MapComponent } from './map/map.component';
import { TooltipComponent } from './tooltip/tooltip.component';
import { StateDetailsService } from './state-details.service';
import { MapDetailsService } from './map.service';
import { HttpModule } from '@angular/http'

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    SidebarComponent,
    MapComponent,
    TooltipComponent
  ],
  imports: [
    BrowserModule,
    ChartModule,
    BrowserAnimationsModule,
    HttpModule
    
  ],
  providers: [StateDetailsService,MapDetailsService],
  bootstrap: [AppComponent]
})
export class AppModule { }
