<#import "../index.ftl" as c>

<@c.page>

    <h1>Latvia Frequency Allocation Table</h1>
    <p>This online version of the Latvian Frequency Allocation Table is an easy way to browse and search how spectrum bands are allocation in the Latvia</p>

    <form action="">
        <div class="row">
            <div class="col-md-4 mb-3">
                <div class="input-group">
                    <span class="input-group-text" id="presets">Presets:</span>
                    <select class="form-select" aria-label="-- choose presets --" aria-describedby="presets">
                        <option selected disabled>-- choose presets --</option>
                        <option value="1">One</option>
                        <option value="2">Two</option>
                        <option value="3">Three</option>
                    </select>
                </div>
            </div>
            <div class="col-md-4 mb-3">
                <div class="input-group">
                    <span class="input-group-text" id="lower_freq">Lower freq:</span>
                    <input type="text" class="form-control" placeholder="0">
                    <select class="form-select" aria-describedby="lower_freq">
                        <option value="hz">Hz</option>
                        <option value="khz">kHz</option>
                        <option value="mhz">MHz</option>
                        <option value="ghz">GHz</option>
                    </select>
                </div>
            </div>
            <div class="col-md-4 mb-3">
                <div class="input-group">
                    <span class="input-group-text" id="upper_freq">Upper freq:</span>
                    <input type="text" class="form-control" placeholder="0">
                    <select class="form-select" aria-describedby="upper_freq">
                        <option value="hz">Hz</option>
                        <option value="khz">kHz</option>
                        <option value="mhz">MHz</option>
                        <option value="ghz">GHz</option>
                    </select>
                </div>
            </div>
            <div class="col-md-4 mb-3">
                <div class="input-group">
                    <span class="input-group-text" id="text">Text:</span>
                    <input type="text" class="form-control" placeholder="Search string" aria-label="Search string" aria-describedby="text">
                </div>
            </div>
            <div class="col-12">
                <button type="submit" class="btn btn-success">Search</button>
            </div>
        </div>
    </form>

    <#if frequencies??>
        <div class="table-responsive mt-3">
            <table class="table table-striped table-bordered">
                <thead class="align-middle text-center">
                    <tr>
                        <th colspan="7">Radiofrekvenču sadalījuma tabula</th>
                    </tr>
                    <tr class="primary-color-all text-white">
                        <th>Nr. p. k.</th>
                        <th>ITU sadalījums radiosakaru dienestiem (veidiem) 1. reģionā</th>
                        <th>Sadalījums radiosakaru dienestiem (veidiem) Latvijā</th>
                        <th>Iedalījums radiosakaru sistēmām Latvijā</th>
                        <th>Informācija par atbilstību starptautiskajiem radiofrekvenču spektra izmantošanas nosacījumiem atbilstoši šo noteikumu 4. pielikumam</th>
                        <th>Papildu nosacījumi</th>
                        <th>EFIS</th>
                    </tr>
                    <tr>
                        <th></th>
                        <th>2</th>
                        <th>3</th>
                        <th>4</th>
                        <th>5</th>
                        <th>6</th>
                        <th>7</th>
                    </tr>
                </thead>
                <tbody>
                    <#list frequencies as frequency>
                        <tr>
                            <td colspan="7" class="text-center">${frequency.bandwidth}</td>
                        </tr>
                        <tr>
                            <td>${frequency.id}</td>
                            <td>${frequency.ituAllocationRegion1}</td>
                            <td>${frequency.allocationLatvia}</td>
                            <td>${frequency.radioSystemsLatvia}</td>
                            <td>${frequency.internationalUsageInfo}</td>
                            <td>${frequency.additionalConditions}</td>
                            <td>${frequency.efis}</td>
                        </tr>
                    </#list>
                </tbody>
            </table>
        </div>
        <#else>
        <h1>N/A</h1>
    </#if>
</@c.page>