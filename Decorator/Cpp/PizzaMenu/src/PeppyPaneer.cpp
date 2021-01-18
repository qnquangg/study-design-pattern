/*
 * PeppyPaneer.cpp
 * Concrete component extends from base component
 *
 *  Created on: Jan 18, 2021
 *      Author: nquang
 */

#include "PeppyPaneer.h"
#include <iostream>
using namespace std;

PeppyPaneer::PeppyPaneer()
{
	this->name = "Peppy Paneer";
	this->description = "This is Peppy Paneer pizza";
}

string PeppyPaneer::getDescription() const
{
	return this->description;
}

string PeppyPaneer::getName() const
{
	return this->name;
}

int PeppyPaneer::getCost() const
{
	return 100;
}
